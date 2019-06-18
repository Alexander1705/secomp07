package secomp07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import secomp07.model.Computer;
import secomp07.model.ComputerStorage;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    ComputerStorage computerStorage;

    @RequestMapping(value = "/computers", method = RequestMethod.GET)
    public List<Computer> getComputers() {
        return computerStorage.fetchList();
    }

    @RequestMapping(value = "/computers", method = RequestMethod.POST)
    public void postComputer(
            @RequestParam String name,
            @RequestParam Float cpuFrequency,
            @RequestParam Integer coresCount,
            @RequestParam Integer ramSize,
            @RequestParam Integer storageSize
    ) {
        Computer computer = new Computer();
        computer.setName(name);
        computer.setCpuFrequencyGHz(cpuFrequency);
        computer.setCoresCount(coresCount);
        computer.setRamMB(ramSize);
        computer.setStorageGB(storageSize);

        computerStorage.add(computer);
    }

    @RequestMapping(value = "/computers", method = RequestMethod.DELETE)
    public void deleteComputer(@RequestParam Integer index) {
        computerStorage.remove(index);
    }
}
