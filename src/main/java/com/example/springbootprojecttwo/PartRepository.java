package com.example.springbootprojecttwo;


import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PartRepository {

    ArrayList<Part> parts = new ArrayList<>();

    public PartRepository() {
        parts.add(new Part("cog",1));
        parts.add(new Part("bolt", 2));
    }

    public ArrayList<Part> getParts() {
        return parts;
    }
    public Part getPart(int id) {
        for (Part part : parts) {
            if (part.ID() == id) {
                return part;
            }
        }
        return null;
    }

    public void addPart(Part part) {
        parts.add(part);
    }

    public void addPartByName(String name) {
        int id = parts.size()+1;

        Part part = new Part(name, id);
        parts.add(part);
    }
    public void addParts(ArrayList<Part> parts) {

        this.parts.addAll(parts);
    }

    public void deletePart(int ID) {
        Part part2 = null;
        for (Part part : parts) {
            if (part.ID() == ID) {
                part2 = part;
            }
        }
        parts.remove(part2);
    }
}
