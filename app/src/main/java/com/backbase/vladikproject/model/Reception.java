package com.backbase.vladikproject.model;

import java.util.List;

public class Reception {
    private Doctor doctor;
    private Client client;
    private List<Drag> drags;

    public Reception (Doctor doctor, Client client, List<Drag> drags){
      this.doctor = doctor;
      this.client = client;
      this.drags = drags;
    }
}
