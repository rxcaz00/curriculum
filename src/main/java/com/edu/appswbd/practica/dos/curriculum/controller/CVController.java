package com.edu.appswbd.practica.dos.curriculum.controller;

import com.edu.appswbd.practica.dos.curriculum.model.CurriculumVitae;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv")
public class CVController {

    @GetMapping(value = "/datos")
    public String obtenerDatos(Model model) {
        CurriculumVitae vitae = new CurriculumVitae();
        vitae.setApellidoMaterno("Gutiérrez");
        vitae.setApellidoPaterno("Cabrales");
        vitae.setNombre("Roberto");
        vitae.setCorreo("roberto.cabrales@uabc.edu.mx");
        vitae.setDireccion("Calle Miguel Alemán #85, Pob. Mezquital");
        vitae.setIdiomaNat("Español");
        vitae.setIdiomas("Ingles");
        vitae.setTelefono("(686) 270-3792");
        vitae.setPreparatoria("Cobach Estación Coahuila");
        vitae.setUniversidad("Universidad Autónoma de Baja California");
        vitae.setCapacitacion("Informática de Oficinas");
        vitae.setCarrera("Lic. Sistemas Computacionales");

        model.addAttribute("cv",vitae);

        return "cv";
    }
}

