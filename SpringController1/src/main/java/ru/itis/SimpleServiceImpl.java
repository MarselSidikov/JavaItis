package ru.itis;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService {
    public String getSomeInfo() {
        return "Hello";
    }
}
