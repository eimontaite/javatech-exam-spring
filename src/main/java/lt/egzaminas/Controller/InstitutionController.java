package lt.egzaminas.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lt.egzaminas.Model.Book;
import lt.egzaminas.Model.Institution.Institution;
import lt.egzaminas.Model.Institution.InstitutionCreate;
import lt.egzaminas.Service.InstitutionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@Api(value = "Institution")
public class InstitutionController {

    @Autowired
    private InstitutionService institutionService;

    @PostMapping("/api/institution")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "New institution")
    public void addInstitution(@RequestBody InstitutionCreate institutionCreate){
        institutionService.addInstitution(institutionCreate);
    }

    @GetMapping("/api/institution/{institutionId}")
    @ResponseStatus(HttpStatus.OK)
    public Institution getInstitution(@PathVariable long institutionId){
        return institutionService.getInstitution(institutionId);
    }

    @DeleteMapping("/api/institution/{institutionId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeInstitution(@PathVariable long institutionId){
        institutionService.removeInstitution(institutionId);
    }
    @GetMapping("/api/institution")
    @ResponseStatus(HttpStatus.OK)
    public List<Institution> getAll(){
        return institutionService.getAll();
    }
    @GetMapping("/api/institution/{institutionId}/book")
    @ResponseStatus(HttpStatus.OK)
    public Set<Book> getInstitutionBooks(@PathVariable long institutionId){
        return institutionService.getInstitutionBooks(institutionId);
    }

    @PostMapping("/api/institution/{institutionId}/book")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewBookToInstitution(@PathVariable long institutionId, @RequestBody Book book){
        institutionService.addNewBookToInstitution(institutionId, book);
    }

    @PostMapping("/api/institution/{institutionId}/book/{bookId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBookToInstitution(@PathVariable long institutionId, @PathVariable long bookId){
        institutionService.addBookToInstitution(institutionId, bookId);
    }

    @DeleteMapping("/api/institution/{institutionId}/book/{bookId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeBookFromInstitution(@PathVariable long institutionId, @PathVariable long bookId){
        institutionService.removeBookFromInstitution(institutionId, bookId);
    }
    }

