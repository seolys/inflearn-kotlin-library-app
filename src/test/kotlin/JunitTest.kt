import org.junit.jupiter.api.*

class JunitTest {

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            println("beforeAll - 모든 테스트 시작 전")
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            println("afterAll - 모든 테스트 종료 후")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("beforeEach- 각 테스트 시작 전")
    }

    @AfterEach
    fun afterEach() {
        println("afterEach - 각 테스트 종료 후")
    }

    @Test
    fun test1() {
        println("test1")
    }

    @Test
    fun test2() {
        println("test2")
    }
}