package com.example.logback.testlogback;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vincent
 */
@Slf4j
public class Foo {
    public void doIt() throws NoSuchMethodException {
        log.debug("Did it again!");
    }
}
