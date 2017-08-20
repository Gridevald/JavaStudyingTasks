package org.home.chapter04.partA.puppy;

public class Puppy extends Dog{
    
    public Puppy() {
        super();
    }
    
    public Puppy(String name) {
        super(name);
    }
    
    @Override
    public void voice() {
        System.out.println("Puppy burk");
    }
    
    @Override
    public void jump() {
        System.out.println("Funny little jump");
    }
    
    @Override
    public void bite() {
        System.out.println("Easy bite");
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
