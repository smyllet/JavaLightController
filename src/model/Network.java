package model;

import exception.AddressIpAlreadyUseException;
import exception.ObjetNotFoundException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Network {
    private final List<Objet> objets;

    public Network() {
        this(Collections.emptyList());
    }

    public Network(List<Objet> objets) {
        this.objets = objets;
    }

    public List<Objet> getObjets() {
        return objets;
    }

    public void addObjet(Objet object) throws AddressIpAlreadyUseException {
        if (objets.stream().anyMatch(objet -> objet.getAddressIp().equals(object.getAddressIp()))) {
            throw new AddressIpAlreadyUseException();
        } else objets.add(object);
    }

    public void removeObjet(Objet object) {
        objets.remove(object);
    }

    public Objet getObjetByAddressIp(String addressIp) throws ObjetNotFoundException {
        Optional<Objet> objet = objets.stream().filter(o -> o.getAddressIp().equals(addressIp)).findFirst();
        if (objet.isPresent()) {
            return objet.get();
        } else {
            throw new ObjetNotFoundException("Objet introuvable");
        }
    }
}
