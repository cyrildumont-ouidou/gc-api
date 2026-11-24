package fr.orsys.msa.gc.resource;

import fr.orsys.msa.gc.data.ClientRepository;
import fr.orsys.msa.gc.model.Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
@Slf4j
public class ClientResource {

    private final ClientRepository clientRepository;

    @GetMapping
    List<Client> getClients(){
/*        Client client = new Client();
        client.setFirstname("Cyril");
        client.setLastname("Dumont");
        return List.of(client);*/
        log.info("Recherche de clients");
        List<Client> clients = clientRepository.findAll();
        log.debug("Nombre de clients retournés : {}", clients.size());
        return clients;

    }
}
