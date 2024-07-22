package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void findByCategory_shouldReturnCollectionWithThatCategory() {
        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);

        assertEquals(4, popItems.size());

        for(MusicItem m : popItems){
            assertEquals(MusicCategory.POP, popItems.getMusicCategory());
        }
    }

    @Test
    public void findById_shouldReturnMusicItemWithThatId_idFound() {
        MusicItem item = catalog.findById(18L);

        assertEquals(18L, item.getId().longValue());
    }

    @Test
    public void findById_shouldReturnNull_idNotFound() {
        MusicItem item = catalog.findById(1001L);
        assertNull(item);
    }
}