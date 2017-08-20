package org.home.chapter04.partA.puppy;

public class Dog extends Animal{
    
    public Dog() {
        super();
    }
    
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void voice() {
        System.out.println("Dog burk!");
    }
    
    public void jump() {
        System.out.println("Big dogs jump");
    }
    
    public void run() {
        System.out.println("Dog is running");
    }
    
    public void bite() {
        System.out.println("Big bite");
    }
    
    @Override
    public String toString() {
        return getClass().getName() + ": name " + getName();
    }
    
    @Override
    public int hashCode() {
        return 3 * getClass().hashCode() + 5 * getName().hashCode();
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Puppy p = (Puppy) object;
        if (getName() == null) {
            if (p.getName() != null) {
                return false;
            }
        } else {
            if (!getName().equals(p.getName())) {
                return false;
            }
        }
        return true;
    }
}
