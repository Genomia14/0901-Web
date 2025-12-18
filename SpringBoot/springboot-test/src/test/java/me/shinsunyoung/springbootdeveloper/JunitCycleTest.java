package me.shinsunyoung.springbootdeveloper;

import org.junit.jupiter.api.*;

public class JunitCycleTest {
    @BeforeAll // 전체 테스트 시작전 1번 실행
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }
    @BeforeEach // 각 테스트 시작 전 실행
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }@Test
    public void test2(){
        System.out.println("test2");
    }@Test
    public void test3(){
        System.out.println("test3");
    }
    @AfterAll // 전체 테스트가 끝난 후 실행
    static void afterAll() {
        System.out.println("@AfterAll");
    }
    @AfterEach // 각 테스트가 끝난 후 실행
    public void afterEach(){
        System.out.println("@AfterEach");
    }
}
