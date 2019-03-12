package com.finanx.main;

import java.util.Objects;

public class Client {
    private String NAME;
    private String EMAIL;
    private String MOBILENO;

    public Client(String NAME, String EMAIL, String MOBILENO) {

        this.NAME = NAME;
        this.EMAIL = EMAIL;
        this.MOBILENO = MOBILENO;

    }


    /**
     * @return RETURNS CLIENT'S NAME
     */
    public String getName() {

        return NAME;

    }

    /**
     * @return RETURNS CLIENT'S EMAIL
     */
    public String getEmail() {

        return EMAIL;

    }

    /**
     * @return RETURNS CLIENT'S MOBILE NUMBER
     */
    public String getMobileNo() {

        return MOBILENO;

    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof Client)
            return false;

        Client client = (Client) obj;

        return Objects.equals(NAME, client.NAME) && Objects.equals(EMAIL, client.EMAIL) && Objects.equals(MOBILENO, client.MOBILENO);

    }

    @Override
    public int hashCode() {
        return 1;
    }

}
