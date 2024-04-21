package com.cardio_generator.generators;

import com.cardio_generator.outputs.OutputStrategy;

public interface PatientDataGenerator { //an interface design
    void generate(int patientId, OutputStrategy outputStrategy);
}
