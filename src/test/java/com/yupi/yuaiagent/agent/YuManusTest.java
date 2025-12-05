package com.yupi.yuaiagent.agent;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YuManusTest {

    @Resource
    private YuManus yuManus;

    @Test
    public void run() {
        String userPrompt = """
                我的另一半居住在上海市静安区，请帮我找到 5 公里内合适的约会地点，
                并附加一些地点图片，制定一份详细的约会计划，注明地点的大致距离
                并以 PDF 格式输出""";
        String answer = yuManus.run(userPrompt);
        Assertions.assertNotNull(answer);
    }
}
