/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JTextArea;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.meta.Vote;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.filters.unsupervised.attribute.Remove;

/**
 *
 * @author tirde
 */
public class CombinedClassifier1 {
    static String train_path;
    static String test_path;
    static JTextArea jta1;
    static JTextArea jta2;
    public static void run() {
        try{
            Instances train= DataSource.read(train_path);
            Instances test= DataSource.read(test_path);
            train.setClassIndex(train.numAttributes()-1);
            test.setClassIndex(test.numAttributes()-1);

            if(!train.equalHeaders(test))
                throw new IllegalArgumentException("datasets are not compatible..");

            Remove rm=new Remove();
            rm.setAttributeIndices("1");
            Classifier[] classifiers = {				
				new J48(),
				new NaiveBayes(),
				new RandomForest()
		};
            Vote voter = new Vote();
		voter.setClassifiers(classifiers);//needs one or more classifiers
		voter.buildClassifier(train);
                 int total_anamoly=0;
            int total_instances=0;
            int ana_np=0;
            int n_ana_p=0;
            int ana_p=0;
            int cp=0;
            int icp=0;


            for(int i=0;i<test.numInstances();i++){
                double pred = voter.classifyInstance(test.instance(i));
                String a="anomaly";
                String actual;
                String predicted;
                actual=test.classAttribute().value((int) test.instance(i).classValue());
                predicted= test.classAttribute().value((int) pred);
                /*jta1.append("ID: " + i);
                jta1.append(", actual: "+ actual);
                jta1.append(", predicted: "+ predicted);
                jta1.append("\n-----------------------------------------------------------\n");
                */
                /*System.out.print("ID: " + i);
                System.out.print(", actual: "+ actual);
                System.out.print(", predicted: "+ predicted);
                System.out.print("\n-----------------------------------------------------------\n");
                */if(actual.equalsIgnoreCase(a))
                    total_anamoly++;
                if(actual.equalsIgnoreCase(predicted))
                    cp++;
                if(!actual.equalsIgnoreCase(predicted))
                    icp++;
                if(actual.equalsIgnoreCase(a)&&predicted.equalsIgnoreCase(a))
                    ana_p++;
                if((!actual.equalsIgnoreCase(a))&&predicted.equalsIgnoreCase(a))
                    n_ana_p++;
                if(actual.equalsIgnoreCase(a)&&(!predicted.equalsIgnoreCase(a)))
                    ana_np++;
                total_instances++;
            }
            double accuracy=(cp*100)/(cp+icp);
            double recall=ana_p*100/(total_anamoly);
            double precision= ana_p*100/(ana_p+n_ana_p);
           /* jta2.append(" total_instances : "+total_instances+"\n total_anamoly : "+total_anamoly);
            jta2.append("\n correct pred : "+cp+"\n incorrect predictions : "+icp);
            jta2.append("\n precision : "+precision+"\n recall : "+recall);
            jta2.append("\n accuracy : "+accuracy);
          */System.out.print(" total_instances : "+total_instances+"\n total_anamoly : "+total_anamoly);
            System.out.print("\n correct pred : "+cp+"\n incorrect predictions : "+icp);
            System.out.print("\n precision : "+precision+"\n recall : "+recall);
            System.out.print("\n accuracy : "+accuracy);
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
     public void init(String trainpath, String testpath, JTextArea jta2,JTextArea jta3) {
		this.train_path=trainpath;
		this.test_path=testpath;
		this.jta1=jta2;
                this.jta2=jta3;
    }
     public static void main(String[] args) {
        run();
    }
}
