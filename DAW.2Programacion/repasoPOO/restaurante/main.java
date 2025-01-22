package restaurante;

import java.util.Scanner;

public class main {

    static void opciones() {
        System.out.println("Para ver menu tecla 1 ");
        System.out.println("Para pedir tecla 2 ");
        System.out.println("Para pedir la cuenta 3");
        System.out.println("Para salir de la programa 0");
    }

    static void menu() {
        System.out.println("Platos disponibles : ");
        platos p1 = new platos("pescado", 5.5);
        platos p2 = new platos("Pollo", 4.5);
        System.out.println("******* plato 1 *******");
        p1.info();
        System.out.println(" ");
        System.out.println("******* plato 2 *******");
        p2.info();
        System.out.println(" ");

    }

    static ordenes pedir(mesas mesas, clientes clientes, platos platos) {
        ordenes o1 = new ordenes(clientes, mesas, platos);
        o1.info();

        return o1;

    }

    static void cuenta(ordenes ordenes, mesas mesas) {
        double cuenta = ordenes.cuenta(mesas.getCapacidadMesa());
        System.out.println("Cuenta de mesa : " + cuenta);

    }

    public static void main(String[] args) {
        System.out.println("****Bienvenido****");
        Scanner scanner = new Scanner(System.in);

        mesas m1 = new mesas(2, "libre", 1);
        mesas m2 = new mesas(3, "libre", 2);

        System.out.println("Para ver mesas libres pulsa 1 ");
        int answer = scanner.nextInt();
        if (answer == 1) {
            platos p1 = new platos("pescado", 5.5);
            platos p2 = new platos("Pollo", 4.5);
            m1.info();
            System.out.println("------------------------------------------------");
            m2.info();
            System.out.println("Para reservar uno de las mesas libres teclan su numero: ");
            int mesaelegir = scanner.nextInt();
            if (mesaelegir == 1) {
                clientes c1 = new clientes(999, "parsa", m1);
                c1.info();
                System.out.println("------------------------");
                m1.setEstadoMesa("Ocupada!");

                opciones();
                int x = scanner.nextInt();
                while (!(x == 0)) {
                    if (x == 1) {
                        menu();
                        System.out.println("para pedir 1 , para salir 0 ! ");
                        int uno = scanner.nextInt();
                        if (uno == 1) {

                            System.out.println("eligen entre el plato 1 / 2");
                            int pedir = scanner.nextInt();
                            if (pedir == 1) {
                                pedir(m1, c1, p1);
                                opciones();
                                int y = scanner.nextInt();
                                if (y == 3) {
                                    System.out.println("Cuentaaaa!");
                                    cuenta(pedir(m1, c1, p1), m2);
                                    m1.setEstadoMesa("Libre!");
                                    m1.info();
                                } else {
                                    break;
                                }

                            } else if (pedir == 2) {
                                pedir(m1, c1, p2);
                                opciones();
                                int y = scanner.nextInt();
                                if (y == 3) {
                                    System.out.println("Cuentaaaa!");
                                    cuenta(pedir(m1, c1, p2), m2);
                                    m1.setEstadoMesa("Libre!");
                                    m1.info();
                                } else {
                                    break;
                                }

                            }
                            System.out.println("------------------------");
                            break;

                        } else if (uno == 0) {
                            System.out.println("Saliendo de la programa!");
                            break;
                        }

                    } else if (x == 2) {
                        System.out.println("eligen entre el plato 1 / 2");
                        int pedir = scanner.nextInt();
                        if (pedir == 1) {
                            pedir(m1, c1, p1);
                            opciones();
                            int y = scanner.nextInt();
                            if (y == 3) {
                                System.out.println("Cuentaaaa!");
                                cuenta(pedir(m1, c1, p1), m2);
                                m1.setEstadoMesa("Libre!");
                                    m1.info();
                                break;
                            } 

                        } else if (pedir == 2) {
                            pedir(m1, c1, p2);
                            opciones();
                            int y = scanner.nextInt();
                            if (y == 3) {
                                System.out.println("Cuentaaaa!");
                                cuenta(pedir(m1, c1, p2), m2);
                                m1.setEstadoMesa("Libre!");
                                    m1.info();
                                break;
                            } 

                        }
                        System.out.println("------------------------");
                        
                    }

                }

            } else if (mesaelegir == 2) {
                clientes c1 = new clientes(999, "parsa", m1);
                c1.info();
                System.out.println("------------------------");
                m1.setEstadoMesa("Ocupada!");

                opciones();
                int x = scanner.nextInt();
                while (!(x == 0)) {
                    if (x == 1) {
                        menu();
                        System.out.println("para pedir 1 , para salir 0 ! ");
                        int uno = scanner.nextInt();
                        if (uno == 1) {

                            System.out.println("eligen entre el plato 1 / 2");
                            int pedir = scanner.nextInt();
                            if (pedir == 1) {
                                pedir(m2, c1, p1);
                                opciones();
                                int y = scanner.nextInt();
                                if (y == 3) {
                                    System.out.println("Cuentaaaa!");
                                    cuenta(pedir(m2, c1, p1), m2);
                                } else {
                                    break;
                                }

                            } else if (pedir == 2) {
                                pedir(m2, c1, p2);
                                opciones();
                                int y = scanner.nextInt();
                                if (y == 3) {
                                    System.out.println("Cuentaaaa!");
                                    cuenta(pedir(m2, c1, p2), m2);
                                } else {
                                    break;
                                }

                            }
                            System.out.println("------------------------");
                            break;

                        } else if (uno == 0) {
                            System.out.println("Saliendo de la programa!");
                            break;
                        }

                    } else if (x == 2) {
                        System.out.println("eligen entre el plato 1 / 2");
                        int pedir = scanner.nextInt();
                        if (pedir == 1) {
                            pedir(m2, c1, p1);
                            opciones();
                            int y = scanner.nextInt();
                            if (y == 3) {
                                System.out.println("Cuentaaaa!");
                                cuenta(pedir(m2, c1, p1), m2);
                                break;
                            } 

                        } else if (pedir == 2) {
                            pedir(m2, c1, p2);
                            opciones();
                            int y = scanner.nextInt();
                            if (y == 3) {
                                System.out.println("Cuentaaaa!");
                                cuenta(pedir(m2, c1, p2), m2);
                                break;
                            } 

                        }
                        System.out.println("------------------------");

                    }
                }
               
            }

        } else {
            System.out.println("Saliendo de la programa!");
        }

    }
}
