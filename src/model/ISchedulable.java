/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author JulianaAndrea
 */
public interface ISchedulable {
    void schedule(Date date, String time);
}
