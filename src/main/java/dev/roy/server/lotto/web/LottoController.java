package dev.roy.server.lotto.web;

import dev.roy.server.lotto.domain.Lotto;
import dev.roy.server.lotto.repository.LottoRepository;
import dev.roy.server.lotto.service.LottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lotto")
public class LottoController {
    @Autowired
    private LottoRepository repository;

    @Autowired
    private LottoService lottoService;

    @RequestMapping("/getNumberList")
    public List<Lotto> getNumberList() {
        return repository.findAll();
    }

    @RequestMapping("/makeNumber")
    public Lotto makeNumber() {
        lottoService.makeLottoNumber();
        return repository.findByName("yongchol");
    }
}