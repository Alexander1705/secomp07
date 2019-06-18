package secomp07.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("computerStorage")
public class ComputerStorageLogger extends ComputerStorage {
    Logger logger = LoggerFactory.getLogger(ComputerStorageLogger.class);

    @Override
    public void add(Computer computer) {
        logger.info("Adding computer: " + computer);
        super.add(computer);
    }

    @Override
    public void remove(int index) {
        Computer computer = fetchList().get(index);
        logger.info("Removing computer: " + computer);
        super.remove(index);
    }
}
