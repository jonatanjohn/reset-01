package Usuario;

import java.time.LocalDate;

public class Usuario {


        private int id;

        private String nome;

        private String email;

        private double telefone;

        private LocalDate dataDeNascimento;

        private String bio;

        private double latitude;

        private double longitude;

        public Usuario(String nome, String email, double telefone, LocalDate dataDeNascimento, String bio, double latitude, double longitude) {

            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.bio = bio;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public int getId() {
            return id;
        }
        public void setId(final int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public double getTelefone() {
            return telefone;
        }
        public void setTelefone(double telefone) {
            this.telefone = telefone;
        }

        public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
        public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

        public String getBio() {
            return bio;
        }
        public void setBio(String bio) {
            this.bio = bio;
        }

        public double getLatitude() {
            return latitude;
        }
        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
        return longitude;
    }
        public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


        @Override
        public String toString() {
            return "Filme{" +
                    "id: " + id +
                    ", nome: '" + nome + '\'' +
                    ", email: '" + email + '\'' +
                    ", telefone: " + telefone + '\'' +
                    ", dataDeNascimento: " + dataDeNascimento + '\'' +
                    ", bio: " + bio + '\'' +
                    ", latitude: " + latitude +'\'' +
                    ", longitude: " + longitude + '\'' +
                    '}';
        }
    }




