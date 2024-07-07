package com.example.stickhero;

import javafx.scene.transform.Rotate;

public interface StickMethods {
    public void grow();
    public void restore();
    public double rotate(Rotate rotate);
    public boolean isEnough();

}