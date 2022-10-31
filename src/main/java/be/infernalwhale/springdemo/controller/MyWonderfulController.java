package be.infernalwhale.springdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wonderful")
public class MyWonderfulController {
    // https://www.youtube.com:443/watch?v=CBfGIR0NqCE

    // 200, 404, 314, 204
    // 1xx >> information
    // 2xx >> all is well, here is your response
    // 3xx >> You don't need to be HERE, but somewhere else... (REDIRECT)
    // 4xx >> Error (You fucked up)
    // 5xx >> Error (We fucked up)
    // { "error": "Name of customer not complete" }
    @GetMapping("/hello")
    public ResponseEntity doStuff() {
        return ResponseEntity.ok("Hello World from the controller");
    }

    @PostMapping("/hello")
    public ResponseEntity helloPost() {
        return ResponseEntity.ok("Hello from the POST endpoint");
    }

    @GetMapping("/employee/{idee}")
    public ResponseEntity getEmployee(@PathVariable("idee") Long id) {
        return ResponseEntity.ok("Received var id with value: " + id);
    }

    @GetMapping("/employee")
    public ResponseEntity getEmployee(@RequestParam("empname") String name) {
        return ResponseEntity.ok("Received param with value: " + name);
    }

    @PostMapping("/employee")
    public ResponseEntity createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok("Emp received: " + employee.toString());
    }

    @GetMapping("/testLara")
    public ResponseEntity testing(@RequestBody Employee employee) {
        return ResponseEntity.ok("Emp received: " + employee.toString());
    }
}
