package com.blibli.oss.common2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author Eko Kurniawan Khannedy
 */
@SpringBootApplication
@Import(CommonAutoConfigurer.class)
public class TestApplication {
}
