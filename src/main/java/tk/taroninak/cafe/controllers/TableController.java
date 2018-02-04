package tk.taroninak.cafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tk.taroninak.cafe.services.TableService;

@Controller
public class TableController {
    @Autowired
    private TableService tableService;
}
