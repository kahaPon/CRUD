/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Register;

/**
 *
 * @author nierema_sd2081
 */
public class User {
    
    private String fnm,mnm,lnm,em,pwd;
    
    public User(String fnm, String mnm, String lnm, String email, String pwd)
    {
        this.fnm = fnm;
        this.mnm = mnm;
        this.lnm = lnm;
        this.em = em;
        this.pwd = pwd;
    }

    /**
     * @return the fnm
     */
    public String getFnm() {
        return fnm;
    }

    /**
     * @return the mnm
     */
    public String getMnm() {
        return mnm;
    }

    /**
     * @return the lnm
     */
    public String getLnm() {
        return lnm;
    }

    /**
     * @return the em
     */
    public String getEm() {
        return em;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }
    
    
}
