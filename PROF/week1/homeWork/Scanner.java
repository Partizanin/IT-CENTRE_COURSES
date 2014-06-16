package PROF.week1.homeWork;

import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 01.05.2014
 * Time: 19:12
 * To change this template use File|Setting|File Templates.
 */
public class Scanner {

        private boolean isClosed;
        private final Reader in;
        private String delemiter;

        public Scanner(Reader in) {
            this.in = new BufferedReader(in);
        }

        public Scanner(String src) {
            char[] array = src.toCharArray();
            in = new BufferedReader(new CharArrayReader(array));
        }

        public String next() {
            StringBuilder stringBuilder = new StringBuilder();

            try {
                int codePoint;

                while ((codePoint = in.read()) != -1) {
                    if (Character.isSpaceChar(codePoint)) {
                        break;
                    }
                    stringBuilder.append((char) codePoint);
                }

                isEndOfTheStream(codePoint);

            } catch (IOException e) {
                e.printStackTrace();
            }

            checkOnNull(stringBuilder.toString());

            return checkDelemiter(stringBuilder.toString());

        }

        private String checkDelemiter(String str) {
            if (delemiter == null) {
                return str;
            } else {
                return refactor(str);
            }
        }

        private String refactor(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] result = s.split(delemiter);
            for (String each : result) {
                stringBuilder.append(each);
            }

            return stringBuilder.toString();
        }

        private void checkOnNull(String s) {
            if (s.length() == 0) {
                throw new NoSuchElementException();
            }
        }

        public int nextInt() {
            StringBuilder stringBuilder = new StringBuilder();

            try {
                int codePoint;
                while ((codePoint = in.read()) != -1) {
                    if (Character.isLetter(codePoint)) {
                        throw new InputMismatchException();
                    }

                    if (!Character.isWhitespace(codePoint)) {
                        stringBuilder.append((char) codePoint);
                    }
                }
                isEndOfTheStream(codePoint);
            } catch (IOException e) {
                e.printStackTrace();
            }
            checkOnNull(stringBuilder.toString());

            return Integer.parseInt(stringBuilder.toString());

        }


        public String nextLine() {
            StringBuilder stringBuilder = new StringBuilder();

            try {
                int codePoint;
                while ((codePoint = in.read()) != -1) {
                    if ((char) codePoint == '\r') {
                        break;
                    }
                    stringBuilder.append((char) codePoint);
                }
                isEndOfTheStream(codePoint);
            } catch (IOException e) {
                e.printStackTrace();
            }
            checkOnNull(stringBuilder.toString());

            return checkDelemiter(stringBuilder.toString());

        }

        private void isEndOfTheStream(int codePoint) {
            if (codePoint == -1) {
                isClosed = true;
                closeStream();
            }
        }

        public boolean hasNext() {
            return !isClosed;
        }

        public boolean hasNextInt() {
            return !isClosed;
        }

        public Scanner useDelemiter(String src) {
            delemiter = src;
            return this;
        }

        public void close() {
            isClosed = true;
        }

        private void closeStream() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


