package com.medhead.medhead.ResponseObjects;

import java.util.List;

import com.medhead.medhead.entities.Specialite;

public class GetAllSpecResponse extends BaseResponse{

    private List<Specialite> specialites;

    public List<Specialite> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(List<Specialite> specialites) {
        this.specialites = specialites;
    }
    
}
