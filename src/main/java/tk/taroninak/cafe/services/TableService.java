package tk.taroninak.cafe.services;

import org.springframework.beans.factory.annotation.Autowired;
import tk.taroninak.cafe.repository.TableRepository;

public class TableService {
    @Autowired
    private TableRepository tableRepository;
}
