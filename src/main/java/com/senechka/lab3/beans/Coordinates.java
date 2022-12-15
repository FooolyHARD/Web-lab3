package com.senechka.lab3.beans;

import lombok.*;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Named("coordinates")
@RequestScoped
public class Coordinates implements Serializable {
    private double x;
    private double y;
    private double r;
    @ToString.Exclude
    private final double[] rValues = {1, 1.5, 2, 2.5, 3};

    public void setFirstRValue() {
        System.out.println("Set first r");
        this.r = rValues[0];
    }
    public void setSecondRValue() { this.r = rValues[1]; }
    public void setThirdRValue() { this.r = rValues[2]; }
    public void setFourthRValue() { this.r = rValues[3]; }
    public void setFifthRValue() { this.r = rValues[4]; }
}
