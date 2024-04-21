package com.cardio_generator.outputs;

public interface OutputStrategy {  //an interface model
    void output(int patientId, long timestamp, String label, String data);
}
