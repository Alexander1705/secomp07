package secomp07.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ComputerStorage {
    private List<Computer> computers = new ArrayList<>();

    public void add(Computer computer) {
        computers.add(computer);
    }

    public void remove(int index) {
        computers.remove(index);
    }

    public List<Computer> fetchList() {
        return computers;
    }

    public int size() {
        return computers.size();
    }
}
