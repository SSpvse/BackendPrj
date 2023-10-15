package com.example.springbootprojecttwo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@Slf4j

public class PartController {
    @Autowired
    PartService partService;

//for commit to be able to commit, again here to commit again
    @Value("${jason:happyWord}")
    private String happyWord;
    // this method could be osmething to be used to import passcodes from the .yaml file.
    @Value("${rnd.number}")
    private int number;

    // ResponceEntity , not working ...

    // GET PARTS  -------
    @GetMapping("/part")
    public Part getPart(@RequestParam int ID) {
        Tobias tobiNumber = new Tobias();
        System.out.println(tobiNumber.getTobias());
        return partService.getPart(ID);
    }

   // @GetMapping("/partss")
   // public ResponseEntity<ArrayList<Part>> getParts() {
   //
   //     return ResponseEntity.ok(partService.getParts()) ;
   // }





    //@GetMapping("/parts")
    //public ArrayList<Part> getParts() {
    //
    //    return partService.getParts();
    //}

    @GetMapping("/parts")
    public ArrayList<Part> getParts() {
        return partService.getParts();
    }


    @GetMapping("/paarts")
    public ResponseEntity<ArrayList<Part>> getPartss() {
        return ResponseEntity.ok(partService.getParts());
    }

    // ADD PARTS -----
    @PutMapping("/part")
    public void putPart(@RequestBody Part part) {
        partService.addPart(part);
    }

    @PostMapping("/part")
    public void postPart(@RequestBody Part part) {
        partService.addPart(part);
    }
    // --- add by name only, id will be generated automatically
    @PostMapping("/part/name")
    public void postPart(@RequestParam String name) {
        partService.addPartByName(name);
    }

    @PostMapping("/parts")
    public void postParts(@RequestBody ArrayList<Part> parts) {
        partService.addParts(parts);
    }
    // DELETE PARTS -----
    @DeleteMapping("/part")
    public void deletePart(@RequestParam int ID) {
        partService.deletePart(ID);
    }
    // instead of @RequestParam, @PathVariable instead.

}
