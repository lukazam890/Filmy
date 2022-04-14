package pl.zajecia.filmy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.zajecia.filmy.dao.entity.VideoCassete;
import pl.zajecia.filmy.manager.VideoCasseteManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassets")
public class VideoCasseteApi {

    private VideoCasseteManager videoCassetes;

    @Autowired
    public VideoCasseteApi(VideoCasseteManager videoCassetes) {
        this.videoCassetes = videoCassetes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassete> returnAll() {
        return videoCassetes.findAll();
    }

    @GetMapping
    public Optional<VideoCassete> getById(@RequestParam Long index){
        return videoCassetes.findAllById(index);
    }

    @PostMapping
    public VideoCassete addVideo(@RequestBody VideoCassete videoCassete){
        return videoCassetes.save(videoCassete);
    }

    @PutMapping
    public VideoCassete updateVideo(@RequestBody VideoCassete videoCassete){
        return videoCassetes.save(videoCassete);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long index){
        videoCassetes.delete(index);
    }
}
