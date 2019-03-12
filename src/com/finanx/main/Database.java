package com.finanx.main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    // Database Client List: Number, List of Cards Associated
    public static Map<Client, Map<Integer, List<Card>>> CLIENTLIST = new HashMap<Client, Map<Integer, List<Card>>>();
    //          Client Data
    private Map<Integer, List<Card>> CLIENTNUMBER = new HashMap<Integer, List<Card>>();
    //          Cards List
    private List<Card> CLIENTCARDS = new ArrayList<Card>();


}
