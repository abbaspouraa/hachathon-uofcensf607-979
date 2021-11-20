//package com.ENSF607.AnimalProject.controller;
//
//
//import com.ENSF607.AnimalProject.model.Animal;
//import com.ENSF607.AnimalProject.model.Comment;
//import com.ENSF607.AnimalProject.service.StudentService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.net.HttpURLConnection;
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/api/student")
//public class StudentController {
//
//    final
//    StudentService studentService;
//
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }

    //    @PostMapping("/getAllAnimals/{id}/{pass}")
//    @RequestMapping(method = RequestMethod.GET,value ="/getAllAnimals/{id}/{pass}" )
//    @GetMapping("/getAllAnimals/{userID}/{userPass}")
//    public ResponseEntity<List<Animal>> getAllAnimal(
//            @RequestParam(value = "animalName", required = false) String name,
//            @RequestParam(value = "animalSex", required = false) String sex,
//            @RequestParam(value = "specie", required = false) String spc,
//            @PathVariable("userID") String id,
//            @PathVariable("userPass") String pass) {
//        Animal param = new Animal(name, spc, sex==null? null:sex.charAt(0));
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.searchAnimal(param, id, pass));
//    }



//    @PutMapping("/get")
//    public String PutMapping(){
//        return "<h1>PutMapping</h1>";
//    }
//
//    @PatchMapping("/get")
//    public String PatchMapping(){
//        return "PatchMapping";
//    }

//    @GetMapping("/delete/{ucid}")
//    public String DeleteMapping(@PathVariable("ucid") int UCID){
//        return "Deleted Successfully: " + studentService.deleteStudent(UCID);
//    }
//}
