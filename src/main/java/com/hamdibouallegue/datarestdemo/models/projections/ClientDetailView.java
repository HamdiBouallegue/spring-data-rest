package com.hamdibouallegue.datarestdemo.models.projections;

import com.hamdibouallegue.datarestdemo.models.Address;
import com.hamdibouallegue.datarestdemo.models.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
// This is a virtual projection
@Projection(name = "clientDetailView", types = {Client.class})
public interface ClientDetailView {
    // We linked the firstName with this method and now we can name the method what ever we want
    // spring expression language
    @Value("#{target.firstName}")
    public String getName();

    public String getLastName();
    public String getEmail();
    public int getPhoneNumber();
    public Address getAddress();
}
