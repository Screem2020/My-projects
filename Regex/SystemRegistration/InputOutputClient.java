package Regex.SystemRegistration;


import lombok.Getter;
import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
@Getter
public class InputOutputClient {
    @SneakyThrows
    public void saveDateClient(List<Client> clientList) {
        try (ObjectOutputStream fis = new ObjectOutputStream
                (new FileOutputStream("src/main/java/Regex/SystemRegistration/registr.txt"))) {
            fis.writeObject(clientList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    public List<Client> loadDateClient(){
        List<Client> clientList = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/Regex/SystemRegistration/registr.txt"))) {
            clientList = (List<Client>) ois.readObject();
        } catch (IOException e) {
        }
        return clientList;
    }
}
