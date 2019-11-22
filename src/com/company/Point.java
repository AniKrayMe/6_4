package com.company;

public class Point {
    private int coordinateX;
    private int coordinateY;

    //region Getter and Setter


    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    //endregion

    public void calculateDistanceXYFrom00() {
        double number = Math.abs(Math.sqrt(Math.pow(this.coordinateX, 2) + Math.pow(this.coordinateY, 2)));
        //https://kartinkinaden.ru/uploads/posts/2016-01/1453467613_1.jpg
        double distance = Math.abs(this.coordinateX * this.coordinateY / number);
        //http://900igr.net/up/datas/168563/007.jpg
        System.out.println("Distance (X,Y) from (0,0) = "+distance);
    }
    public void calculateDistanceXFromY(){
        double distance =Math.abs(Math.sqrt(Math.pow(this.coordinateX, 2) + Math.pow(this.coordinateY, 2)));
        System.out.println("Distance X from Y = " + distance);
    }
    //region Constructor
    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Point() {
    }
    //endregion
}
