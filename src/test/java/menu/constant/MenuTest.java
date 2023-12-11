package menu.constant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    @DisplayName("존재하는 메뉴")
    @ParameterizedTest
    @ValueSource(strings = {"우동", "스시"})
    void hasMenu_존재하는_메뉴(String menu) {
        assertTrue(Menu.hasMenu(menu));
    }

    @DisplayName("일부 존재하지 않는 메뉴")
    @ParameterizedTest
    @CsvSource({"우동,true", "순대국밥,false", "스시,true"})
    void hasMenu_일부_존재하지_않는_메뉴(String menu, boolean expected) {
        assertEquals(expected, Menu.hasMenu(menu));
    }

    @DisplayName("전부 존재하지 않는 메뉴")
    @ParameterizedTest
    @ValueSource(strings = {"샤브샤브", "순대국밥", "돈까스"})
    void hasMenu_일부_존재하지_않는_메뉴(String menu) {
        assertFalse(Menu.hasMenu(menu));
    }
}