package com.example.springbootprojecttwo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class PartService {

    // @Autowired,
    // this is for threadsafety.. {{{
    private final PartRepository partRepository;

    @Autowired
    public PartService(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    //   }}}}}




    // GET PARTS
    public ArrayList<Part> getParts() {
        return partRepository.getParts();
    }
    public Part getPart(int id) {
        return partRepository.getPart(id);
    }

    // ADD PARTS
    public void addPart(Part part) {
        partRepository.addPart(part);
    }

    public void addPartByName(String name) {
        partRepository.addPartByName(name);
    }
    public void addParts(ArrayList<Part> parts) {
        partRepository.addParts(parts);
    }

    // DELETE PARTS

    public void deletePart(int ID) {
        partRepository.deletePart(ID);
    }
}
