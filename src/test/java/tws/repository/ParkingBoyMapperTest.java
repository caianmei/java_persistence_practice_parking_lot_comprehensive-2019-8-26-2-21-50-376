package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.ParkingBoy;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingBoyMapperTest {

    @Autowired
    private ParkingBoyMapper parkingBoyMapper;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "parking_boy");
    }

    @Test
    public void shouldFetchAllParkingBoys() {
        // given
        jdbcTemplate.execute("INSERT INTO parking_boy VALUES(1,'zhangsan');");
        // when
        List<ParkingBoy> parkingBoyList = parkingBoyMapper.selectAll();
        // then
        assertEquals(1, parkingBoyList.size());
    }
}
