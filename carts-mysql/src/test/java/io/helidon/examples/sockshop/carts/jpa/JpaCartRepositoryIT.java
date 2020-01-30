package io.helidon.examples.sockshop.carts.jpa;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import io.helidon.examples.sockshop.carts.CartRepository;
import io.helidon.examples.sockshop.carts.CartRepositoryTest;

/**
 * Integration tests for {@link io.helidon.examples.sockshop.carts.jpa.JpaCartRepository}.
 */
public class JpaCartRepositoryIT extends CartRepositoryTest {

    @Override
    protected CartRepository getCartRepository() {
        SeContainer cdi = SeContainerInitializer.newInstance().initialize();
        return cdi.select(CartRepository.class).get();
    }
}