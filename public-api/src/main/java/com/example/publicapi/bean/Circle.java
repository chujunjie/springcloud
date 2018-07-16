package com.example.publicapi.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Circle extends Shape implements Serializable {

    private float radius;

    transient int color;

    public static String type ="Circle";
}
