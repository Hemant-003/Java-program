package com.company;

public class Monitor {
    private String BrandName;
    private int size;
    private String Model;
    private Resolution nativeResolution;

    public Monitor(String BrandName,Resolution nativeResolution,int size,String Model){
        this.BrandName=BrandName;
        this.nativeResolution=nativeResolution;
        this.Model=Model;
        this.size=size;
    }
        public void DrawPixelAt(int x, int y, String color){
            System.out.println("Draw  pixel At " + x + " And " + y + " of color " + color);
        }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public String getBrandName() {
        return BrandName;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return Model;
    }
}
