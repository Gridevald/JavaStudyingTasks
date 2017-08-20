package org.home.chapter03.partC.myArray;

import java.util.Comparator;

public class MyArray<T extends Number> {
    
    private T[] array;
    
    public MyArray(T[] array) {
        this.array = array;
    }
    
    public T[] getArray() {
        return array;
    }
    
    public void setArray(T[] array) {
        this.array = array;
    }
    
    public void sortBubble(Comparator<T> c) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (c.compare(array[j], array[j + 1]) < 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public void sortShaker(Comparator<T> c) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (c.compare(array[i], array[i + 1]) < 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (c.compare(array[i], array[i - 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
        }
    }
    
    public void sortSelection(Comparator<T> c) {
        int start = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int pos = start;
            for (int j = start + 1; j < array.length; j++) {
                if (c.compare(array[j], array[pos]) < 0) {
                    pos = j;
                }
            }
            if (pos != start) {
                T temp = array[start];
                array[start] = array[pos];
                array[pos] = temp;
            }
            start++;
        }
    }
    
    public void sortInsertion(Comparator<T> c) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && c.compare(array[j], array[j - 1]) < 0) {
                T temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
    
    public void sortMerge(Comparator<T> c) {
        split(array, c);
    }
    
    @SuppressWarnings("unchecked")
    private void split(T[] arrayMerge, Comparator<T> c) {
        //Need to split array, if it's large, than 1, else it's already sorted
        if (arrayMerge.length > 1) {
            
            //Split array in 2 halves
            T[] first = (T[]) new Number[arrayMerge.length / 2];
            T[] second = (T[]) new Number[arrayMerge.length - first.length];
            System.arraycopy(arrayMerge, 0, first, 0, first.length);
            System.arraycopy(arrayMerge, first.length, second, 0, second.length);
            
            //Sort each half recursively (split while size = 1 )
            split(first, c);
            split(second, c);
            
            //Merge both halves together, overwriting to original array
            merge(first, second, arrayMerge, c);
        }
    }
    
    private void merge(T[] first, T[] second, T[] arrayMerge, Comparator<T> c) {
        //Index Position in first array - starting with first element
        int iFirst = 0;
        
        //Index Position in second array - starting with first element
        int iSecond = 0;
        
        //Index Position in merged array - starting with first position
        int iMerged = 0;
        
        //Compare elements at iFirst and iSecond, and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length) {
            if (c.compare(first[iFirst], second[iSecond]) < 0) {
                arrayMerge[iMerged] = first[iFirst];
                iFirst++;
            } else {
                arrayMerge[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, arrayMerge, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, arrayMerge, iMerged, second.length - iSecond);
    }
    
    public void sortShell(Comparator<T> c) {
        //You can put here some sequence of steps...
        int step = array.length;
        while (step > 0) {
            for (int i = 0; i < array.length; i += step) {
                int j = i;
                while (j > 0 && c.compare(array[j], array[j - step]) < 0) {
                    T temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    j -= step;
                }
            }
            step = step / 2;
        }
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Array: ");
        for (T t : array) {
            sb.append(t).append(" ");
        }
        return sb.toString();
    }
}
