/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mybeans;

import javax.ejb.Stateless;

/**
 *
 * @author AVI03
 */
@Stateless
public class Bean implements BeanRemote {

    @Override
    public double ftoC(double F) {
        double C = (5.0/9.0) * (F -32);
        return C ;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
