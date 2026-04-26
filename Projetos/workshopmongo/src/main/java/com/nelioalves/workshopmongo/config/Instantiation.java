package com.nelioalves.workshopmongo.config;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.dto.AuthorDTO;
import com.nelioalves.workshopmongo.dto.CommentDTO;
import com.nelioalves.workshopmongo.repository.PostRepository;
import com.nelioalves.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        simpleDate.setTimeZone(TimeZone.getTimeZone("GMT"));

        User userOne = new User(null, "Maria Alencar", "Maria@email.com");
        User userTwo = new User(null, "Juao Silva", "Juao@email.com");
        User userThree = new User(null, "Roberto espinhola", "Roberto@email.com");

       userRepository.insert(Arrays.asList(userOne, userTwo, userThree));

       postRepository.deleteAll();

       Post postOne = new Post(null, simpleDate.parse("21/03/2018"), "Bora de viajas?", "Vou para xique-xique amanhã", new AuthorDTO(userOne));
       Post postTwo = new Post(null, simpleDate.parse("23/03/2018"), "Bom dia", "Estou feliz, pois estou em xique-xique", new AuthorDTO(userOne));

       CommentDTO commentOne = new CommentDTO("Que incrivel", simpleDate.parse("21/03/2018"), new AuthorDTO(userTwo));
       CommentDTO commentTwo = new CommentDTO("Aproveite", simpleDate.parse("22/03/2018"), new AuthorDTO(userThree));
       CommentDTO commentThree = new CommentDTO("Tenha uma boa viajem", simpleDate.parse("23/03/2018"), new AuthorDTO(userTwo));

       postOne.getCommentDTOS().addAll(Arrays.asList(commentTwo, commentThree));
       postTwo.getCommentDTOS().add(commentOne);

       postRepository.insert(Arrays.asList(postOne, postTwo));

       userOne.getPosts().addAll(Arrays.asList(postOne, postTwo));
       userRepository.save(userOne);

    }
}
