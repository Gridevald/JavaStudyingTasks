package org.home.chapter03.enumPractice;

public enum Shape {
    RECTANGLE, TRIANGLE, CIRCLE;
    
    public double defineSquare(double ... x) {
        switch (this) {
            case RECTANGLE:
                return x[0] * x[1];
            case TRIANGLE:
                return x[0] * x[1] / 2;
            case CIRCLE:
                return Math.PI * Math.pow(x[0], 2);
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }
}
