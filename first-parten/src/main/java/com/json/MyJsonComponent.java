package com.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.first.entity.Position;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.boot.jackson.JsonObjectSerializer;

import java.io.IOException;

@JsonComponent
public class MyJsonComponent {

    public static class Serializer extends JsonObjectSerializer<Position> {

        @Override
        protected void serializeObject(Position value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            jgen.writeObjectField("name", "ddddd");
            jgen.writeObjectField("age", "ccccccccccc");
        }

    }

//    public static class Deserializer extends JsonObjectDeserializer<MyObject> {
//
//        @Override
//        protected MyObject deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec,
//                                             JsonNode tree) throws IOException {
//            String name = nullSafeValue(tree.get("name"), String.class);
//            int age = nullSafeValue(tree.get("age"), Integer.class);
//            return new MyObject(name, age);
//        }
//
//    }

}