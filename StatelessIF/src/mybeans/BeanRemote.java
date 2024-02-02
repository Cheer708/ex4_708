/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package mybeans;

import javax.ejb.Remote;

/**
 *
 * @author AVI03
 */
@Remote
public interface BeanRemote {

    double ftoC(double F);
    
}
