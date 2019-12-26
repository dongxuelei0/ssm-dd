package com.bd.youdao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data

@AllArgsConstructor
@NoArgsConstructor
public class Web {

    private List<String> value;
    private String key;

    @Override
    public String toString() {
        return "Web{" +
                "value=" + value +
                ", key='" + key + '\'' +
                '}';
    }
}
