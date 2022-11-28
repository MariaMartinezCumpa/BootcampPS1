package com.bootcampP1.bancoclientes.mapper;

import com.bootcampP1.bancoclientes.dto.ClientDto;
import com.bootcampP1.bancoclientes.entity.Client;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientMapper {
    public static ClientDto mapToClientDto(Client client) {

        ClientDto clientDto = new ClientDto();
        clientDto.setId(client.getId().toString());
        clientDto.setName(client.getName());
        clientDto.setIsActive(client.getIsActive());
        clientDto.setDateReg(client.getDateReg());
        clientDto.setNroDocument(client.getNroDocument());
        clientDto.setTypeDocument(client.getTypeDocument());
        clientDto.setType(client.getType());
        return clientDto;
    }

    public static Client mapToClient(ClientDto clientDto) {
        Client client = new Client();
        if (Objects.nonNull(clientDto.getId())) {
            client.setId(new ObjectId(clientDto.getId()));
        }
        client.setName(clientDto.getName());
        client.setIsActive(Boolean.TRUE);
        client.setDateReg(new Date());
        client.setNroDocument(clientDto.getNroDocument());
        client.setTypeDocument(clientDto.getTypeDocument());
        client.setType(clientDto.getType());
        return client;
    }
}
