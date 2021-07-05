package com.hamdibouallegue.datarestdemo.models.projections;

import com.hamdibouallegue.datarestdemo.models.Address;
import com.hamdibouallegue.datarestdemo.models.Client;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "clientDetail", types = {Client.class})
public interface ClientDetail {
    public String getFirstName();
    public String getLastName();
    public String getEmail();
    public int getPhoneNumber();
    public Address getAddress();
}
